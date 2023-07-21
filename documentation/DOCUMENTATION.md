<link rel="stylesheet" href="styles.css">

# Linked-List-Data-Structure

------------------

<h4 class="set-font-normal" style="float: left">Date : &nbsp;</h4><h4 style="float: left">July 13th, 2023</h4>

<br><br>

------------------

Welcome!
This is an implementation of the Linked List data structure.
After recently implementing the basics of the ArrayList data structure, I've now decided to move forward and study the
Linked List.
As of the time of writing this file, I've spent roughly over 7 hours in total studying the fundamentals of the Linked
List.
<div class="float-left">Fundamentals:</div>
<ul>
    <li>Creation of the 'Node' Class</li>
    <li>Instance Variables</li>
    <li>Methods for manipulating nodes (i.e. setLink, setData, addNodeAfter, etc)</li>
</ul>

I've had some trouble figuring out how to properly create and format a Linked List via the driver class 'Main'
So I am hoping that my approach to this implementation is correct, but I started off by creating two initial nodes, '
head' and 'tail',
and then proceeded to add the standard nodes in-between 'head' and 'tail'

After creating my nodes, I found it helpful visualizing in my head how to link those nodes together.
In this implementation, I am hoping that I'm on the right path by assigning every node an 'initialLink' of 'null.'
Anyhow,
everything seems
to work accordingly since it makes sense to override that null value with the reference of the newly created node.

In other words, 'head.setLink(node1)' will override the 'null' value found initially in 'head' and set it to the
reference of an Objects (node1) memory address.
To help you better understand what I'm saying...

head --> null ('null' because it hasn't been linked to another node)

head.setLink(node1);

head --> node1 ('head' now references the next node, 'node1' in the list)

When we call 'head.getLink'
rather than getting 'null,' we will instead get the memory address for the next node object which is 'node1'
Because 'head' now reference 'node1'

Our Linked List would visually look like this now...

head(data = 10)   -->   node1(data = 20)   -->   tail(data = 30)

'head' references the next node 'node1' and 'node1'
will also reference its next node 'tail'—This essentially <strong>LINKS</strong> the objects together.
I hope you understand what I'm trying to get at here, but the data structure should follow its intended implementation.

------------------

<h4 class="set-font-normal" style="float: left">Date : &nbsp;</h4><h4 style="float: left">July 20th, 2023</h4>

<br><br>

------------------

Welcome back!
I quickly wanted to document some of the changes I've done so far with this implementation of the Linked List.
I've added a few more methods that should help with the overall functionality of the Linked List.

<h2>listSearch</h2>
`listSearch` is a method that searches for a particular piece of data within a `Node`.
The method outputs the link that references the Node we are looking for.
If the Node is <strong>NOT</strong> found, the method will return `null`.
<br><br>The way this method works is by inputting two different arguments into to the parameters of the method.
The first argument is of type `Node` because we'll be searching from a `Node` object, and in this case,
most often, I believe,
we'll be searching from the `head` node which essentially indicates our starting position to begin the search.
After we've inputted our first argument, we then input our second argument, which is of type `int`,
because we're now searching for the target value that should be contained within a Node in the list.
Moving forward, we create our `cursor` object, which plays the role of keeping track of the nodes that we iterate through.
We then create the `for` loop,
we set `cursor` equal to the starting position of the Node,
then, if `cursor` is <strong>NOT</strong> equal to `null` value,
then set 'cursor' equal to the following node that our initial node references. 
The result is our `cursor` object now pointing to the next `Node` in the list.

<h2>listData</h2>
`listData` is a method that prints out the data contained within a Node object.
This method takes in only one parameter, `head`,
which indicates that we'll begin the traversal starting preferably from the <strong>head</strong> of the list.
The parameter is of type `Node` which indicates that we'll be passing in a `Node` object.
The process begins similar to that of the `listSearch` method.
We create a `cursor` object that will keep track of the nodes that we iterate through.
The print statement that follows is completely optional, it's just there to help us visualize the data.
We then create a `for` loop that initializes `cursor` to the starting position of the `head` Node,
if the cursor's reference does <strong>NOT</strong> equal to a `null` value,
then we set the cursor equal to the next Node that follows in the list. 

<h2>listLength</h2>
The list `listLength` is a method that returns the number of Nodes in a list.
The method only contains one parameter,
which is labeled `head` to indicate that our preferred starting position will be at the head of the Node.
You could, of course, start iterating through your desired position,
but if we're wanting to count the total number of Nodes within a list, then it's recommended to begin at the head.
Inside the body of the method, we declare a local variable `answer`,
that plays the role of keeping track the number of Nodes contained within the list.
We assign the value of 0 to the local variable to indicate that no Nodes have been counted.
The `cursor` plays the same role as it has before in previous methods.
We then finally reach our `for` loop.
The loop, again, plays the same role as it has before, we assign `cursor` the head Node of our list.
Then while the reference to the next Node is not `null`.
We set the `cursor` equal to the next Node in the list.
Then we increment the `answer` variable by 1.
Which indicates that we've counted a Node.
Once we break out of the loop, we return the `answer` variable.
