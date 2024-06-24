package functional

/**
 * 코틀린에서는 확장 메커니즘을 사용해 모든 클래스에 새 멤버를 추가 가능
 * 확장 함수 및 확장 속성이라는 두 가지 유형의 확장 존재
 *
 * 일반 함수 및 속성과 매우 비슷해 보이지만, 확장하는 유형을 지정해야 한다는 차이점이 있음
 */

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun doExtensionFunctions() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0f)))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}

/**
 * Max priced item name: Wine
 * Max priced item value: 29.0
 * Items: Bread, Wine, Water
 */

/**
 * null 참조에서 확장 함수를 실행하는 것도 가능
 * 확장 함수에서 객체가 null인지 확인하고, 그 결과를 코드에 사용 가능
 */
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1