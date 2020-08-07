# kotlin-101-example

# practice Kotlin!

https://kotlinlang.org/

## SDK man
https://sdkman.io/install

## Kotlin playgroud
https://play.kotlinlang.org

# IntelliJ IDEA

##  generate main function
type 'main' -> Tab

## refactor to function
ctrl + alt + M


# Ch1
## Kotlin math
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.math/


# Ch2
[study group slide](https://docs.google.com/presentation/d/1h2VifsXOuWUgSp4dxvcoCfmBVSeNjsrdUeFJe3mULpo/edit?usp=sharing)

# Val v.s Var
![](https://i.imgur.com/2AZ3evY.png)

![](https://i.imgur.com/ibfura4.png)

![](https://i.imgur.com/gXe0jYQ.png)

# something need to know
### in fun, we can't modify the parameters(it's val!) of fun
![](https://i.imgur.com/MPCbZHw.png)

![](https://i.imgur.com/Lv8eX3M.png)



---

# Boolean
## Boolean can write as JS syntax
![](https://i.imgur.com/1B6E1D5.png)
### but just for Boolean!
![](https://i.imgur.com/FHFfVPW.png)


# Ch3
source code: [Game.kt](https://github.com/timmyBeef/kotlin-101-example/blob/master/src/chapter03/NyetHacker/Game.kt/)


## compare object instance
use === , !== to compare object instance

### if
```kotlin=
    val name = "tim"
    var healPoints = 100

    // if
    if (healPoints == 100) {
        println(name + "is in exllent condition!")
    } else {
        println(name + "is in awful condition!")
    }
```
### val with if
```kotlin=

    // use val with if
    val healthStatus = if (healPoints == 100) {
        "is in exllent condition!"
    } else if (healPoints >= 90) {
        "has few scrathes"
    } else {
        "others"
    }
    println(name + " " +  healthStatus)

    val isImmortal = false;
    val auraVisible = healPoints > 50 || isImmortal
    val auracolor = if (auraVisible) "Green" else "NONE"
    println(auracolor)
```
### Range
```kotlin=
    // use range
    val healthStatusRange = if (healPoints == 100) {
        "is in exllent condition!"
    } else if (healPoints in 90..99) {
        "has few scrathes"
    } else if (healPoints in 70..89) {
        "has some minor wounds"
    } else {
        "others"
    }
```
### more about range
```kotlin=
    // more about range
    println()
    println("more about range")
    println(1 in 1..3)       // true
    println((1..3).toList()) // [1, 2, 3]
    println(1 in 3 downTo 1) // true
    println(1 in 1 until 3)  // true
    println(3 in 1 until 3)  // false
    println(2 in 1..3)       // true
    println(2 !in 1..3)      // false
    println('x' in 'a'..'z') // true
    println()
```
### when
```kotlin=
    // when
    val healthStatusWhen = when (healPoints) {
        100 -> "is in exllent condition!"
        in 90..99 -> "has few scrathes"
        in 70..89 -> "has some minor wounds"
        else -> "others"
    }

```
### string template
```kotlin=
    // string template
    // name + " " +  healthStatus to "$name $healthStatus"
    println("$name $healthStatus")

    // notice: need " "
    println("${if (true) "yes" else "no"}")
```

# ch 4, ch 5
# Function

![](https://i.imgur.com/dkIjIte.png)

![](https://i.imgur.com/Y9ieahw.png)


![](https://i.imgur.com/xOPRuW7.png)


![](https://i.imgur.com/BzkpfuX.png)
internal: only module can use

### function name
for unit test
![](https://i.imgur.com/xxsIgb3.png)
![](https://i.imgur.com/WXuQshr.png)

default value, usaully deine in last
it's easy for pass parameter
![](https://i.imgur.com/M5yxo49.png)

![](https://i.imgur.com/3RinTz1.png)

指定要傳到什麼欄位
![](https://i.imgur.com/SYjqkmn.png)

overloading
![](https://i.imgur.com/EniPuR6.png)

## void
Unit => JAVA void => 為了泛型回傳
nothing: this func compile 不會成功
![](https://i.imgur.com/XjqqKXZ.png)

use TODO
![](https://i.imgur.com/v9FR6vR.png)

## single expression function
只有一行敘述的話, 可以這樣寫
![](https://i.imgur.com/WGyPpmG.png)
![](https://i.imgur.com/whndeO0.png)

# ch 5
根本是立即執行函式...
![](https://i.imgur.com/63cLlB0.png)

## function 也可以是type
![](https://i.imgur.com/xepBKOV.png)

![](https://i.imgur.com/KgBhTjt.png)

一個參數會自動取名（it
![](https://i.imgur.com/6aun0Uc.png)

這類都不用寫return, 最後一行都是回傳（有個lamda
![](https://i.imgur.com/NMmlsUF.png)

跟 js 一樣...可以傳 function
![](https://i.imgur.com/TU2xA6X.png)

## high-order function
![](https://i.imgur.com/S35rPnS.png)

![](https://i.imgur.com/H9hVJ7R.png)

## Lamda
![](https://i.imgur.com/NQ9ayzG.png)


![](https://i.imgur.com/vEYF9ZX.png)

## function ref
![](https://i.imgur.com/Af00v5Z.png)

## anoymous function
![](https://i.imgur.com/hwOTTKC.png)

## lamda 還是可以return的
![](https://i.imgur.com/NkSPlJO.png)

## function inlining
but 那是有performance的問題！
![](https://i.imgur.com/3gHwC33.png)

所以要用 inline, 才不會有效能問題
![](https://i.imgur.com/GzKn6Dj.png)

![](https://i.imgur.com/i2Tnr1o.png)
inline 不適用在遞迴
如果呼叫很多次, 才用 inline
inline 會幫你copy程式碼

## closure
![](https://i.imgur.com/VHO5wUt.png)

### 閉包行為
![](https://i.imgur.com/Zy3YRaR.png)
6, 7 保留之前的狀態

## java vs kotlin
![](https://i.imgur.com/vLhaUfN.png)

![](https://i.imgur.com/G1pRbfX.png)

## kotlin byte code
![](https://i.imgur.com/LZEUPgd.png)

自動幫你幫一個class name(用檔名)
![](https://i.imgur.com/ZtxPcKv.png)

![](https://i.imgur.com/KV8uAbQ.png)
![](https://i.imgur.com/LQa8ezP.png)

![](https://i.imgur.com/6kudiA0.png)

![](https://i.imgur.com/fUV4Zd5.png)