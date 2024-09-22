package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	// コンストラクタ
	public Fighter(String name, String weapon) {	
	// Livingクラスで定義したコンストラクタを利用する
	super(name,weapon); 
	//ヒットポイントの値を決定
	this.hp =  Dice.get(240,300);
	//攻撃力の値
	this.offensive = Dice.get(17,23);
		
	}
}
