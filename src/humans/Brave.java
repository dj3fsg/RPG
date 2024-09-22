package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	    // コンストラクタ
		public Brave(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon); 
		//ヒットポイントの値を決定
		hp =  Dice.get(170,230);
		//攻撃力の値
		offensive = Dice.get(7,13);
		
		}
}
