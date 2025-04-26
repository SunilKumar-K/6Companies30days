class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        
        // Step 1: Separate letter-logs and digit-logs
        for (String log : logs) {
            String[] parts = log.split(" ", 2); // Split into identifier and content
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log); // it's a digit-log
            } else {
                letterLogs.add(log); // it's a letter-log
            }
        }
        
        // Step 2: Sort letter-logs
        Collections.sort(letterLogs, (log1, log2) -> {
            String[] parts1 = log1.split(" ", 2);
            String[] parts2 = log2.split(" ", 2);
            
            int cmp = parts1[1].compareTo(parts2[1]); // compare content
            if (cmp == 0) {
                return parts1[0].compareTo(parts2[0]); // if content same, compare identifier
            } else {
                return cmp;
            }
        });
        
        // Step 3: Combine letter-logs first and then digit-logs
        int n = logs.length;
        String[] result = new String[n];

        for(int i=0;i<letterLogs.size();i++)
        {
            result[i] = letterLogs.get(i);
        }

        for(int i=0;i<digitLogs.size();i++)
        {
            result[i+letterLogs.size()] = digitLogs.get(i);
        }

        return result;


       
        
        
        
    }
}