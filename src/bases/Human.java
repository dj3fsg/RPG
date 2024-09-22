package bases;

import utils.Dice;
//人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon); 
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		int damage = 0;
		int target_hp = 0;
		
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		damage = this.offensive * Dice.get(1, 10);

		// 相手のHPをダメージ値だけ減らす
		target_hp = target.getHp();
		target_hp -= damage;
		target.setHp(target_hp);

		// 自分の攻撃力を1だけ減らす
        this.offensive -= 1;
       
		// コンソールにステータスを表示
        System.out.println("\n「"+ this.name +"」が「"+ this.weapon +"」で攻撃！「"+ target.getName() +"」に"+ damage + "のダメージを与えた。");
        System.out.println("しかし自分の攻撃力も1減少した。");

	}
}