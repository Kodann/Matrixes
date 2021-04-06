public class main {
	public static void main (String [] args) {
		UsualMatrix usualMtr = new UsualMatrix(1000, 1000);
        	SparseMatrix sparseMtr = new SparseMatrix(1000,1000);

        	UsualMatrix mtr1 = new UsualMatrix(4,4);
        	SparseMatrix mtr2 = new SparseMatrix(4, 4);
        	SquareMatrix mtr3 = new SquareMatrix(4);
		
		/*mtr1.setElement(0,0,2);
        	mtr1.setElement(0,1,2);
        	mtr1.setElement(1,0,2);
        	mtr1.setElement(1,1,2);
		System.out.println("Обычная матрица");
        	System.out.println(mtr1);

		mtr3.setElement(0,0,2);
        	mtr3.setElement(0,1,2);
        	mtr3.setElement(1,0,2);
        	mtr3.setElement(1,1,2);
        	System.out.println("Квадратная матрица");
        	System.out.println(mtr3);

		IMatrix prodmtr;
        	prodmtr = mtr1.product(mtr3);
        	System.out.println("Результат: Обычная умножить на квадратную");
        	System.out.println(prodmtr);*/
		
        	mtr1.setElement(0,2,1);
        	mtr1.setElement(1,0,9);
        	mtr1.setElement(2,2,1);
        	mtr1.setElement(3,1,5);
        	mtr1.setElement(3,2,1);
        	System.out.println("Обычная матрица");
        	System.out.println(mtr1);
        	mtr2.setElement(0,2,1);
        	mtr2.setElement(1,0,2);
        	mtr2.setElement(2,2,3);
        	mtr2.setElement(3,0,5);
        	mtr2.setElement(3,2,1);
        	System.out.println("Разряженная матрица");
        	System.out.println(mtr2);

		mtr3.setElement(3,2,9);
		mtr3.setElement(3,1,9);
		mtr3.setElement(3,0,9);
        	System.out.println("Квадратная матрица");
        	System.out.println(mtr3);

        	IMatrix prodmtr;
        	prodmtr = mtr1.product(mtr3);
        	System.out.println("Результат: Обычная умножить на квадратную");
        	System.out.println(prodmtr);

        	IMatrix sumtr;
        	sumtr = mtr2.sum(mtr3);
        	System.out.println("Результат: Разряженная сложить с квадратной");
        	System.out.println(sumtr);

        	int nrow;
        	int ncolumn;
        	int val;
        	int count1=0;
        	int count2=0;
		while (count1 < 10 && count2 < 10) {
			nrow = 0 + (int)(Math.random()*1000);
			ncolumn = 0 + (int)(Math.random()*1000);
			val = 1 + (int)(Math.random()*10);
			if (usualMtr.getElement(nrow, ncolumn) == 0 && count1 < 1000) {
				usualMtr.setElement(nrow, ncolumn, val);
				count1++;
			}
			if (sparseMtr.getElement(nrow, ncolumn) == 0 && count2 < 1000) {
				sparseMtr.setElement(nrow, ncolumn, val);
				count2++;
			}
		}
		//System.out.println(usualMtr);
		//long startTime = System.currentTimeMillis();
		//usualMtr.product(sparseMtr);
		//long endTime   = System.currentTimeMillis();
		//System.out.println(usualMtr);
		//System.out.println(endTime-startTime);
	}
}
