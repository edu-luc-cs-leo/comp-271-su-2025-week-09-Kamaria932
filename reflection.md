***What went well***
The rehash and contains methods logic seems similar to prof. Leo's code. The expand table also seems to have the right logic as well. It doubles the array and re-hashes every node. It follows the programmers pact, has lots of comments, and contains lots of null checks.

***What looks different***
The load factor handling looks different. I have it as a field and Prof. Leo uses it more often. LoadFactor isn't final. My code checks overLimit() using a cache value and Prof. Leo predicts the next load factor before inserting.

***What I should change***
Move this.loadFactor = currentLoadFactor(); at the very end of expandTable() method, so it can recalculate inside the loop. I have a few typos in my code. The code resizes the table after nearly all the slots are used. Maybe it might be helpful to do it before the slots are filled up. My code could be open to duplicate tables if the same node was added in the table set.
