package delegation

/**
 * 코틀린은 보일러플레이트 코드 없이 네이티브로 수준에서
 * 델리게이트 패턴(위임 패턴)을 쉽게 구현할 수 있도록 지원
 *
 * 델리게이트 객체는 by 키워드 뒤에 정의되어 상용구 코드가 필요하지 않음
 */

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("${n.uppercase()} !!!")
}

class RockAndRollBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

// Tom Araya is the "singer" of Slayer
class TomAraya(n: String) : SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)

fun doDelegationPattern() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound() // THRASH METAL !!!

    val elvis = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvis.makeSound() // I'm The King of Rock 'N' Roll: Dancin' to the Jailhouse Rock.
}