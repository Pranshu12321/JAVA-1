package Methods;

 class squareOfNaturalNum
 {
        int res;
        int square(int n)
        {
            res = n * n;
            return res;
        }
 }
    class Launchh
    {
        public static void main(String[] args) {
            squareOfNaturalNum calc = new squareOfNaturalNum();
            int n = 99;
            for( int i=1;i<=n;i++)
            {
                int ans = calc.square(i);
                System.out.println(ans);
            }

        }
    }

