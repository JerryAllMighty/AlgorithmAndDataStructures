package Programmers;

import java.util.*;

public class 기사단원의무기 {
    static int[] cntYaksu;

    //약수의 개수 리턴해주는 배열을 만드는 함수
    void preprocess(int num) {
        cntYaksu = new int[num + 1];
        cntYaksu[0] = 0;
        for (int i = 1; i <= num; i++) {
            cntYaksu[i] = cntYaksu(i);
        }
    }

    int cntYaksu(int num) {
        int answer = 0;

        //제곱근까지의 수만 약수의 개수를 구한다.
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                answer += 2;
            }else if ((i*i) == num) {
                answer++;
            }
        }

        //마지막 제곱급은 중복되므로 빼준다.
        return answer;

    }

    public int solution(int number, int limit, int power) {
        int answer = 0;

        preprocess(number);
        for (int i = 1; i <= number; i++) {
            //각 기사마다 자기 기사번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매한다.
            //각각의 약수의 개수를 구한다

            //공격력 제한 수치가 넘지 않는다면 더한다
            if (cntYaksu[i] > limit) {
                answer += power;
            } else {
                answer += cntYaksu[i];
            }
        }

        return answer;
    }


}


