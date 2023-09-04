function LinkedList() {
  var length = 0;
  var head = null;

  var Node = function(element){
    this.element = element;
    this.next = null;
  };

  this.size = function(){
    return length;
  };

  this.head = function(){
    return head;
  };

  this.add = function(element){
    var node = new Node(element);
    if(head === null){
        head = node;
    } else {
      let currentNode = head;

      while(currentNode.next){
        currentNode  = currentNode.next;
      }

      currentNode.next = node;
    }

    length++;
  };

  this.remove = function(element){
    // Only change code below this line
    let currentNode = head;
    let previous = head;

    while((currentNode != null) && (currentNode.element != element)){
      previous = currentNode;
      currentNode = currentNode.next;
    }

    if(currentNode != null){  // make sure we are not at the end of list
      if(currentNode === head){
        head = head.next;
        return length--;
      } else {
        previous.next = currentNode.next;
        return length--;
      }
    }

    // Only change code above this line
  };
}
