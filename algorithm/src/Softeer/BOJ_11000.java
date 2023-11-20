package algorithm.src.Softeer;
import java.io.*;
import java.util.*;
public class BOJ_11000 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // 시작 시간이 같다면, 뒤의 숫자를 기준으로 오름차순
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[0]==o2[0]){
                    return o1[1] - o2[1];
                }
                //입력 데이터를 오름차순으로 정렬해준다
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 뒷자리부터 넣고
        pq.add(arr[0][1]);

        // 배열을 두 번째 값부터 순찰하면서
        for(int i=1;i<n;i++){
            // 만약에 start와 PriorityQueue의 peek()보다 작거나 같다면, pq에서 하나 뺀다.
            if(pq.peek()<=arr[i][0])pq.poll();
            pq.add(arr[i][1]);
        }
        System.out.println(pq.size());
    }
}
