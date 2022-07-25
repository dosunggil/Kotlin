fun main() {
    var radius = 30
    println("반지름 : $radius")
    println("원둘레 : (${radius * 2 * Math.PI}")
    println("원둘레 : ${radius * radius * Math.PI}")

    var nation = "korea"
    println("${nation[1]}")

    nation = """
        republic of Korea
        대한민국
        우리나라
    """
    println(nation)
    println(nation.trimIndent())

    val arr = arrayOf(1,"Korea",true)
    println("${arr[0]}")
    println("${arr[1]}")
    println("${arr[2]}")

    println("${arr.size}, ${arr.get(0)}")

    // 정수형 배열 선언하고 값 초기화하기
    val arr1 = intArrayOf(3,4,5,6,7,8,9)

    var arr2 = Array<Int>(size = 5, {i -> i * 10})
    for ( a in arr2) {
        println(a)
    }

    var arr3 = IntArray(10 , {i->i + 10})

    var arr4  =  IntArray(10)

    // 데이터를 변경할 수 있는 mutableList
    var mutableList = mutableListOf("Korea", "대한민국")

    // 데이터를 변경할 수 없는 List
    var immutableList = listOf<String>("Korea", "대한민국")
}