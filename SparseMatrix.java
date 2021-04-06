import java.util.*;

public class SparseMatrix extends UsualMatrix {

	private int Srows;
	private int Scolumns;
	private LinkedList<Node> List;

	public SparseMatrix (int i, int j) {
		super(0,0);
		Srows = i;
		Scolumns = j;
		List = new LinkedList<Node>();
	}

	private class Node {
		private int Nrow;
		private int Ncolumn;
		private int value;
		private Node (int i, int j, int value) {
			this.Nrow = i;
			this.Ncolumn = j;
			this.value = value;
		}

		private int getNrows() {
			return Nrow;
		}
		private int getNcolumns() {
			return Ncolumn;
		}
		private int getValue() {
			return value;
		}
		private void setValue(int value) {
			this.value = value;
		}
	}

	public void setElement (int row, int column, int value) {
		ListIterator<Node> iter = List.listIterator();
		while (iter.hasNext()) {
			Node tmp = iter.next();
			if ((tmp.getNrows() == row) && (tmp.getNcolumns() == column)) {
				if (value == 0) {
					iter.remove();
					return;
				}
				tmp.setValue(value);
				return;
			}
		}
		if (value != 0) {
			List.add(new Node(row, column, value));
			return;
		}
	}

	public int getElement(int row, int column) {
		ListIterator<Node> iter = List.listIterator();
		while(iter.hasNext()){
			Node tmp = iter.next();
			if ((tmp.getNrows()== row) && (tmp.getNcolumns() == column)) {
				return tmp.getValue();
			}
		}
		return 0;
	}

	public int getRows() { 
		return Srows; 
	}

	public int getColumns() { 
		return Scolumns; 
	}

	public String toString() {
		StringBuilder buff = new StringBuilder();
		for (int i = 0; i < this.getRows(); i++) {
			for (int j = 0; j < this.getColumns(); j++) {
				ListIterator<Node> iter = List.listIterator();
				boolean isFind = false;
				while (iter.hasNext() && !isFind) {
					Node tmp = iter.next();
    					if (tmp.getNrows() == i && tmp.getNcolumns() == j) {
						buff.append(tmp.getValue()).append(" ");
						isFind = true;
					}
				}
				if(!isFind) {
					buff.append(0).append(" ");
				}
			}
			buff.append("\r\n");
		}
		return buff.toString();
	}
}
