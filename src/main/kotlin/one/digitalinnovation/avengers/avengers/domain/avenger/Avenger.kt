package one.digitalinnovation.avengers.avengers.domain.avenger

data class Avenger(
    val id: Long? = null,
    val nick: String,
    val person: String,
    val description: String? = null,
    val history: String? = null
)
