import {Enum, EnumType} from "./interfaces/ts-jenum";

@Enum("text")
export class ArticleType extends EnumType<ArticleType>() {

    static readonly AT_GOODS        = new ArticleType(1, "Товар");
    static readonly AT_DISH         = new ArticleType(2, "Готовое блюдо");
    static readonly AT_TRADE_SET    = new ArticleType(2, "Торговый комплект");
    static readonly AT_FOODSTUFF    = new ArticleType(2, "Пищевой продукт");

    private constructor(public code: number, public text: string) {
        super();
    }
}