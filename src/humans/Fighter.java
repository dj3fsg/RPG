package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	
	public Fighter(String name, String weapon) {
		
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon); 
		//ヒットポイントの値を決定
		hp =  Dice.get(240,300);
		//攻撃力の値
		offensive = Dice.get(17,23);
		
		}
}
