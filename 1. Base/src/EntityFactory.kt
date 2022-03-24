import java.util.UUID

interface IdProvider {
    fun getId(): String
}

/* -------------- Object expressions -------------- */

//class Entity private constructor(val id: String) {
////    companion object {
////        fun create() = Entity("id")
////    }
//
////  --- name companion object
////  --- companion makes values static
//    companion object Factory : IdProvider {
////     --- `const` is compile time constants and should be always at the top
////     --- `val` could be initialized while runtime
//        const val ID = "id"
//
//        fun create() = Entity(ID)
//
//        override fun getId(): String {
//            return "123"
//        }
//    }
//}
//
//fun main() {
////    val entity = Entity.Companion.create()
////  --- shorten variant
////    val entity = Entity.create()
//
////  --- use named companion object
//    val entity = Entity.Factory.create()
//    Entity.ID
//}


/* -------------- Object declaration -------------- */

//object EntityFactory {
//    fun create() = Entity("id", "name")
//}
//
//class Entity constructor(val id: String, val name: String) {
//    override fun toString(): String {
//        return "id: $id name:$name"
//    }
//}
//
//fun main() {
//    val entity = EntityFactory.create()
//    println(entity)
//}


/* -------------- Enum Objects -------------- */

//enum class EntityType {
//    EASY, MEDIUM, HARD;
//
//    fun getFormatted() = name.lowercase().capitalize()
//}
//
//object EntityFactory {
//    fun create(type: EntityType) : Entity {
//        val id = UUID.randomUUID().toString()
//        val name = when(type) {
//            EntityType.EASY -> type.name
//            EntityType.MEDIUM -> type.getFormatted()
//            EntityType.HARD -> "Hard"
//        }
//
//        return Entity(id, name)
//    }
//}
//
//class Entity constructor(val id: String, val name: String) {
//    override fun toString(): String {
//        return "id: $id name:$name"
//    }
//}

//fun main() {
//    val entity = EntityFactory.create(EntityType.EASY)
//    println(entity) // name:EASY
//
//    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity) // name:Medium
//}


/* -------------- Sealed classes -------------- */

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormatted() = name.lowercase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormatted()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormatted()
        }

        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

// --- with `sealed classes` we can have different properties and methods on each of these type
sealed class Entity () {
//  --- static class
    object Help : Entity() {
        val name = "Help"
    }
//  --- data class can contain only values
    data class Easy(val id: String, val name: String): Entity() {
//    --- we also can override Object methods
//        override fun equals(other: Any?): Boolean {
//            return super.equals(other)
//        }
//
//        override fun hashCode(): Int {
//            return super.hashCode()
//        }
    }
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun main() {
//    val entity:Entity = EntityFactory.create(EntityType.MEDIUM)
//    val message = when(entity) {
//        Entity.Help -> "help class"
//        is Entity.Easy -> "easy class"
//        is Entity.Hard -> "hard class"
//        is Entity.Medium -> "medium class"
//    }
//
//    println(message)

//    val entity1 = Entity.Easy("id", "name")
//    val entity2 = Entity.Easy("id", "name")

//  --- we can copy and receive the save object
//    val entity2 = entity1.copy()
//  --- we can copy and change some values
//    val entity2 = entity1.copy(name = "new name")

//  data classes comparing by data they have not by class hash
//    if (entity1 == entity2) {
//        println("they are equal")
//    } else {
//        println("they are not equal")
//    }

//  --- deep equality comparing values and class hash
    val entity1 = Entity.Easy("id", "name")
    val entity2 = entity1.copy()

    if (entity1 === entity2) {
        println("they are equal")
    } else {
        println("they are not equal")
    }
}