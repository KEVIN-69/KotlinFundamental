fun main() {
    val name = "Kotlin"
    val age = "4"
    val version = "1.3.70"

    val kalimat = """
        Nama saya $name
        Saya berusia $age tahun
        Saat ini saya sudah mencapai versi $version
    """.trimIndent()

    println(kalimat)
}