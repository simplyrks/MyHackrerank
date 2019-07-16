 char[] c = new char[s.length()];
        int i=0;
        for(i=0;i<s.length();i++)
        {
            c[i] = s.charAt(i); 
        }
        int[] rh = new int[s.length()];
        for(i=0;i<c.length;i++)
        {
            rh[i]=c[i]-97;
        }
        int max = rh[0];
        for(i=0;i<c.length;i++)
        {
            if(rh[i]>max)
            max=rh[i];
        }
        return max*s.length();
