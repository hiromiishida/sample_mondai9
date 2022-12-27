public class Main {
    // 要素番号がゼロから開始であるため、問題よりも値は１小さくなっている
    static int[][] tree = {{1, 2},{3, 4},{5, 6},{7, 8},{9, 10},{11, 12},{13}, {}, {}, {}, {}, {}, {}, {}};

    public static void main(String[] args) {
        order(0);
    }

    private static void order(int n){
        if(tree[n].length == 2){
            order(tree[n][0]);
            System.out.println(n);
            order(tree[n][1]);
        }else if(tree[n].length == 1){
            order(tree[n][0]);
            System.out.println(n);
        }else{
            System.out.println(n);
        }
    }
}