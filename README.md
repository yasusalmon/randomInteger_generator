# randomInteger_generator

非負整数のランダム出力のやつ
研究室でc++を触っているのだが、あっちはランダムのためにシード値をこっち側でいじる必要があったが、javaは自動でtimeからシード値を決めてくれるらしく、非常にありがたい。
どうも指定しなければintの最小値から最大値までをランダム出力してくれるみたいだが、ほんまに等確率になってるんかな。C++やと３万ちょいしか出力してくれないはずやから、それ以上のやつをやろうと思ったら桁数ごとに出力が現実的なんかな、とか思ってるけど。桁数を決めて、その回数for回して、for(){ans*=10,ans+=rand()}的な。わからんけどね。
