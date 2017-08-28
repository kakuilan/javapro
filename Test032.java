//二维数组五子棋
import java.util.function.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test032 {

	//定义棋盘的大小
	private static int BOARD_SIZE = 15;

	//定义一个二维数组来填充棋盘
	private String[][] board;

	public void initBoard() {
		//初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//把每个元素赋值"+",用于控制器画出棋盘
		for(int i=0;i<BOARD_SIZE;i++) {
			for (int j=0;j<BOARD_SIZE;j++){
				board[i][j] = "＋";
			}
		}
	}

	//在控制台输出棋盘的方法
	public void printBoard() {
		for (int i=0;i<BOARD_SIZE;i++) {
			for (int j=0;j<BOARD_SIZE;j++) {
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}


	public static void main(String[] args) throws Exception {
		Test032 gb = new Test032();
		gb.initBoard();
		gb.printBoard();

		//这是用于获取键盘输入的方法
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine()每当在键盘上输入一行内容后按回车,刚输入的内容将被br读取到
		while ((inputStr = br.readLine()) != null){
			//将输入的字符串以逗号分隔
			String[] posStrArr = inputStr.split(",");
			//将2个字符串转换成用户下棋的坐标
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);

			//把对应的数组元素赋值为"０"
 			gb.board[yPos-1][xPos-1] = "０";
			gb.printBoard();
			System.out.println("请输入您下棋的坐标,以x,y的格式,"+ BOARD_SIZE+"以内");

		}
	}

}
