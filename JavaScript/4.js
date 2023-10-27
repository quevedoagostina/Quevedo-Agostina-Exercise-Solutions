function isDiagonalMatrix(matrix) {
    for (let i = 0; i < matrix.length; i++) {
      for (let j = 0; j < matrix[0].length; j++) {
        if (i !== j && matrix[i][j] !== 0) {
          return false;
        }
      }
    }
    return true;
  }
  
  const matrix1 = [[1, 0, 0], [0, 2, 0], [0, 0, 3]];
  const matrix2 = [[1, 0, 0], [0, 2, 3], [0, 0, 3]];
  
  console.log(isDiagonalMatrix(matrix1)); 
  console.log(isDiagonalMatrix(matrix2)); 