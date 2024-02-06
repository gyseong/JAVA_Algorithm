package algorithm.src.Implement;


import java.util.*;
import java.io.*;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 문서의 개수
            int n = Integer.parseInt(st.nextToken());

            // 현재 queue에서 몇 번째에 놓여있는지
            int m = Integer.parseInt(st.nextToken());

            // 큐 생성
            LinkedList<int[]> q = new LinkedList<>();

            // 중요도를 입력
            st = new StringTokenizer(br.readLine());

            //큐에 다 집어넣어줌
            for(int j=0;j<n;j++) {
                q.offer(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while(!q.isEmpty()) {
                int[] cur = q.poll();

                // cur이 원소가 가장 큰 원소인지를 판단하는 함수
                boolean check = true;

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int j=0;j<q.size();j++) {
                    // 처음 뽑은 원소보다 큐에 있는 원소가 클 경우
                    if(cur[1]<q.get(j)[1]) {

                        // 큐에 다시 집어넣음
                        q.offer(cur);
                        for(int k=0;k<j;k++) {
                            q.offer(q.poll());
                        }

                        check = false;
                        break;
                    }
                }

                if(!check) {
                    continue;
                }
                count++;
                if(cur[0]==m) {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}