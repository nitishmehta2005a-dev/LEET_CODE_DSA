class Solution(object):
    def findNumbers(self, nums):
       ans=0
       for x in nums:
          count = 0
          while(x>0):
             x=x/10
             count+=1
          if count%2 == 0:
              ans+=1
       return ans

        