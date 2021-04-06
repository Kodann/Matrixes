public interface IMatrix {
     void setElement(int row, int column, int value);
     int getElement(int row, int column);
     int getRows();
     int getColumns();
     boolean equals(Object o);
     String toString();
     IMatrix sum(Object n);
     IMatrix product(Object n);

}
