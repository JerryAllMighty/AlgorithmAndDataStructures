/*
 * 2026 04 02 개인 문제 풀이 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static class Ingredients implements Comparable<Ingredients> {
        private int weight;
        private int price;

        public Ingredients(int weight, int price){
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Ingredients o){
            return o.price - this.price;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Ingredients[] ingredients = new Ingredients[N];
        for(int i =0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            ingredients[i] = new Ingredients(M, P);
        }

        // Arrays.sort(ingredients);
        Arrays.sort(ingredients, (a, b) -> b.price - a.price);

        int index = 0;
        int leftWeight = W;
        int answer = 0;
        while(leftWeight >= 0 && index < N){
            Ingredients ingredient = ingredients[index];

            if(leftWeight >= ingredient.weight){
                leftWeight -= ingredient.weight;
                answer += (ingredient.weight) * (ingredient.price);
                index++;
            }else{
                answer += leftWeight * (ingredient.price);
                break;
            }

        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

 */