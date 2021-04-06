public class SquareMatrix extends UsualMatrix {
	public SquareMatrix(int size) {
		super(size, size);
		for(int i = 0; i < size; i++){
			matrix[i][i] = 1;
		}
	}
}