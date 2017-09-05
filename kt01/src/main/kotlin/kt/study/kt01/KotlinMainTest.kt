package kt.study.kt01

/**
 * package main test for kotlin
 *
 * @author  : panxin
 */
fun main(args: Array<String>) {
    // 正常可运行
    println(KotlinUser(1, "kt_user_01"))
    println(DataKotlinUser(2, "data_kt_user_01"))
    println(JavaUser(3, "java_user_01"))

    // 编译就报错
    // println(KotlinUser(1, null))
    // println(KotlinUser(null, "wtf"))
    // println(DataKotlinUser(null, "xxx"))
    // println(DataKotlinUser(1, null))
    // println(JavaUser(null))
}
