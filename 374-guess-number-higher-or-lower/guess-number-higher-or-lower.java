/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int st = 0;
        int en = n;

        while(st <= en)
        {
            int mid = st + (en-st)/2;
            if( guess(mid) == 0) return mid;
            if(guess(mid) == -1){
                en = mid - 1;
            }
            if(guess(mid) == 1){
                st = mid+1;
            }
        }

        return -1;
    }
}

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         int low = 0;
//         int high = n;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (guess(mid) == 0)
//                 return mid;
//             if (guess(mid) == -1)
//                 high = mid - 1;
//             if (guess(mid) == 1)
//                 low = mid + 1;
//         }

//         return -1;
//     }
// }