# Linked-List-Data-Structure

- July 13th, 2023
  
------------------

Welcome! This is an implementation of the Linked List data structure. 
After recently implementing the basics of the ArrayList data structure, I've now decided to move foward and study the Linked List.
As of the time of writing this file, I've spent roughly over 7 hours in total studying the basic fundamentals of the Linked List.

Basic Fundamentals:
  - Creationg of the 'Node' Class
  - Instance variables (i.e. data, link)
  - Methods for manipulating nodes (i.e. setLink, setData, addNodeAfter, etc)

I've had some trouble figuring out how to properly create and format a Linked List via the driver class 'Main' 
So I am hoping that my approach to this implementation is correct but I started off by creating two initial nodes, 'head' and 'tail', 
and then proceeded to add the standard nodes in-between 'head' and 'tail'

After creating my nodes, I found it helpful visualing in my head how to link those nodes together.
In this implementation, I am hoping that I'm on the right path by assigning every node an 'initialLink' of 'null'.
Anyhow everything seems to work accordingly since it makes sense to override that null value with the reference of the newly created node.

In other words, 'head.setLink(node1)' will override the 'null' value found initially in 'head' and set it to the reference of an Objects (node1) memory address. 
To help you better understand what I'm saying...

head --> null ('null' because it hasn't been linked to another node)

head.setLink(node1);

head --> node1 ('head' now references the next node, 'node1' in the list)

When we call 'head.getLink' rather than getting 'null', we will instead get the memory address for the next node object which is 'node1'
Because 'head' now reference 'node1'

Our Linked List would visually look like this now... 


head(data = 10)

     |
   \ | /
     v
     
node1(data = 20)

     |
   \ | /
     v
     
tail(data = 30)

'head' references the next node 'node1' and 'node1' will also reference its next node 'tail' - This essentially <strong>LINKS</strong> the objects together. 
I hope you understand what I'm trying to get at here, but the data structure should follow it's intended implementation.
