class NthrootofM {

    // Function to find Nth root of M
    public int NthRoot(int N, int M) {

        int low = 1;
        int high = M;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long value = power(mid, N);

            if (value == M) {
                return mid;
            } else if (value < M) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Nth root does not exist
    }

    // Function to calculate base^exp
    public long power(int base, int exp) {

        long ans = 1;

        for (int i = 1; i <= exp; i++) {
            ans *= base;
        }

        return ans;
    }

    public static void main(String[] args) {

        int N = 4;
        int M = 256;

        NthrootofM obj = new NthrootofM();

        int ans = obj.NthRoot(N, M);

        System.out.println(ans);
    }
}