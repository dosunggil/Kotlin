import kotlin.math.truncate

fun main() {
    // num1 변수를 정수형으로 선언하고 10으로 초기화
    var num1 = 10;
    var num2 = 20;
    var sum = num1 + num2;
    // 문자열 Template : 문자열 내에 변수를 직접 사용하여
    // 결과를 출력하는 방법
    println("$num1 + $num2 = $sum")
    
    // num1 이 이미 정수형으로 선언되었기 때문에 문자열로 저장하려면 오류가 발생한다.
    // num1 = "String"

    // 변수를 선언할 때 초기화 없이 강제 형 지정하여 선언하기
    // Kotlin 에서는 이 방법을 권장하지 않는다.
    var num3 : Int ;
    num3 = 10;

    var nation : String;
    nation = "대한민국";

    // final, const,  상수형 변수 선언
    val korea = "대한민국";
    // val 로 선언된 변수는 다시 값을 저장할 수 없다.
    // korea = "republic of Korea";

    println("$korea 은 Republic of Korea");

    for(i in 0..10) {
        println("반복문으로 $i 만들기");
    }
    println();
    
    for(i in 0..10 step(2)) {
        println("$i 값")
    }
    for(i in 10 downTo 0 ) {
        println("$i 값")
    }

    var bYes = true;
    if(bYes) {
        println("$bYes 는 참");
    } else {
        println("$bYes 는 거짓");
    }
    
    // 정수형 요소를 포함하는 배열 선언
    val array1 = intArrayOf(10,20,30,40,50,60,70)
    for(ar in array1) {
        println("$ar")
    }

    for(ar in array1.reversed()) {
        println("$ar");
    }

    // 0 부터 배열의 (개수 - 1) : until
    for(i in 0 until array1.count()){
        println("${array1[i]}")
    }

    var num4 = 1;
    while(num4 <10) {
        print("${num4 ++}, ")
    }
}