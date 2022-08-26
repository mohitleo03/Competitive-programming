class ConsecutivePairsInBST{
    int last;

// Recursive function for in-order traversal
int countPairs (whichever_type treeRoot)
{
  int r = 0; // Return value

  if (treeRoot.leftChild != null)
    r = r + countPairs (treeRoot.leftChild);

  if (treeRoot.value == last + 1)
    r = r + 1;

  last = treeRoot.value;

  if (treeRoot.rightChild != null)
    r = r + countPairs (treeRoot.rightChild);

  return r; // Edit 2016-03-02: This line was missing
}

// Main function
main (whichever_type treeRoot)
{
  int r;

  if (treeRoot == null)
    r = 0;
  else
  {
    last = treeRoot.value; // to make sure this is not one less than the lowest element
    r = countPairs (treeRoot);
  }

  // Done. Now the variable r contains the result
}
}