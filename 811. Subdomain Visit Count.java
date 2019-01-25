/*
A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.

Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".

We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
*/

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> cpdomainsMap = new HashMap<String,Integer>();
        for(String ss:cpdomains){
            String[] arr = ss.split("\\s+");
            Integer c= Integer.parseInt(arr[0]);
            String domain=arr[1];
            String[] domainSplitted=domain.split("\\.");

            for(int s=0;s<domainSplitted.length;s++){
                String subDomains="";
                for(int k=s;k<domainSplitted.length;k++){
                    if(subDomains.equals("")){
                     subDomains=subDomains+domainSplitted[k];
                    }
                    else{
                        subDomains=subDomains+"."+domainSplitted[k];
                    }
                }
            if(cpdomainsMap.get(subDomains)==null){
            cpdomainsMap.put(subDomains,c);
            }
            else{
                Integer count =cpdomainsMap.get(subDomains);
                count=count+c;
                cpdomainsMap.put(subDomains,count);
            }
            }

        }
        List<String> result = new ArrayList<String>();
        for(String domain : cpdomainsMap.keySet()){
            result.add(cpdomainsMap.get(domain)+" "+domain);
        }
        return result;
    }
}
