package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	// コンストラクタ
		public Dragon(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon); 
		//ヒットポイントの値を決定
		hp =  Dice.get(270,330);
		//攻撃力の値
		offensive = Dice.get(12,18);
		
		}	
}
