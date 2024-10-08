import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(bf.readLine());

        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph.get(u).add(new Node(v,w));
        }

        dijkstra(K, dist, graph);

        for (int i = 1; i < dist.length; i++) {
            System.out.println(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]);
        }
    }

    private static void dijkstra(int start, int[] dist, List<List<Node>> graph) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));
        dist[start] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int next = node.next;    // 목적지
            int cost = node.cost;    // 목적지까지의 비용

            // 현재 저장되어있는 비용보다 계산할 비용이 더 높으면 탐색할 필요가 없다.
            if (dist[next] < cost) {
                continue;
            }

            // 이동 가능한 노드들을 탐색한다.
            for (int i = 0; i < graph.get(next).size(); i++) {
                Node nextNode = graph.get(next).get(i);
                int nextTarget = nextNode.next;
                int nextCost = nextNode.cost + cost;

                // 저장되어 있는 비용보다 지금 이동된 비용이 더 낮다면 바꾸고 queue에 저장
                if (dist[nextTarget] > nextCost) {
                    dist[nextTarget] = nextCost;
                    queue.add(new Node(nextTarget, nextCost));
                }
            }
        }
    }
}

class Node implements Comparable<Node> {
    int next;
    int cost;

    public Node(int next, int cost) {
        this.next = next;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return this.cost - o.cost;
    }
}