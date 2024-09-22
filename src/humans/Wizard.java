package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human{
	// コンストラクタ
	public Wizard(String name, String weapon) {
	// Livingクラスで定義したコンストラクタを利用する
	super(name,weapon); 
	//ヒットポイントの値を決定
	this.hp =  Dice.get(120,180);
	//攻撃力の値
	this.offensive = Dice.get(12,18);
			
	}
}
