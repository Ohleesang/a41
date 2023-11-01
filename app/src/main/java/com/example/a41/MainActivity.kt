package com.example.a41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(s: String): String {
                var answer = ""
                var indexExZero :Int = 0
                for(i in 0..s.length-1){
                    //1.공백인지아닌지확인
                    if(s[i] ==' ') {
                        answer += " "
                        indexExZero= 0//각 단어 이니까 초기화해야하는구나
                        continue
                    }
                    // 짝수번째는 대문자 홀수번째는 소문자!
                    if(indexExZero%2==0){
                        answer += s[i].toString().uppercase()
                    }
                    else {
                        answer += s[i].toString().lowercase()
                    }
                    indexExZero++
                }
                return answer
            }
        }
        val a =Solution()
        a.solution("try hello world")
    }
}