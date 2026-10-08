# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
      if not head:
        return head
      current = head.next
      ans = head
      while current:
        if current.val != head.val :
          head.next=current
          head=head.next
        current=current.next
      head.next=None
      return ans

        