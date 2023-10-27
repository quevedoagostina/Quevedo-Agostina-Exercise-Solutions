const data = [
    "Apple", "Orange", "Banana", "Strawberry", "Grape",
    "Mango", "Melon", "Pineapple", "Peach", "Peach"
  ];
  
  
  const containingP = data.filter(str => str.toLowerCase().includes('p'));
  const grapeString = data.find(str => str === 'Grape');
  
  
  console.log("All strings containing the letter 'p':", containingP);
  console.log("The 'Grape' string:", grapeString);
  