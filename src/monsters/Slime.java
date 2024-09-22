package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	// コンストラクタ
		public Slime(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon); 
		//ヒットポイントの値を決定
		hp =  Dice.get(70,130);
		//攻撃力の値
		offensive = Dice.get(5,11);
				
		}	
}
