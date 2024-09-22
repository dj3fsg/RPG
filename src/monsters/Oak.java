package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	// コンストラクタ
	public Oak(String name, String weapon) {
	// Livingクラスで定義したコンストラクタを利用する
	super(name,weapon); 
	//ヒットポイントの値を決定
	hp =  Dice.get(170,230);
	//攻撃力の値
	offensive = Dice.get(9,15);
			
	}	

}
