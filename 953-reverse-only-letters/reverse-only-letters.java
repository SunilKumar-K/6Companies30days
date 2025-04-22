class Solution {
    public String reverseOnlyLetters(String s) {

        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                str.append(s.charAt(i));
            }
        }

        for(int i=0;i<s.length();i++)
        {
            if(!Character.isAlphabetic(s.charAt(i)))
            {
                str.insert(i,s.charAt(i));
            }
        }

        return str.toString();
        // int l = 0;
        // int r = s.length()-1;
        // char res[] = new char[s.length()];

        // while(l <= r)
        // {
        //     if(Character.isAlphabetic(s.charAt(l))&& Character.isAlphabetic(s.charAt(r)))
        //     {
        //         res[r] = s.charAt(l);
        //         res[l] = s.charAt(r);
        //         l++;
        //         r--;
        //     }
        //     else if(!Character.isAlphabetic(s.charAt(l))){
        //         res[l]=s.charAt(l);
        //         l++;
        //     }
        //     else if(!Character.isAlphabetic(s.charAt(r)))
        //     {
        //         res[r] = s.charAt(r);
        //         r--;
        //     }
        // }

        // return new String(res);
    }
}