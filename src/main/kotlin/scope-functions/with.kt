package `scope-functions`

/**
 * with 함수는 인수의 멤버에 간결하게 접근할 수 있는 비확장 함수
 * 멤버를 참조할 때 인스턴스 이름을 생략 가능
 */

class Configuration(var host: String, var port: Int)

fun doWith() {
    val conf = Configuration(host = "127.0.0.1", port = 9000)
    
    with(conf) {
        println("$host: $port")
    }

    // instead of:
//    println("${configuration.host}:${configuration.port}")
}