import {Enum, EnumType} from "./interfaces/ts-jenum";

@Enum("text")
export class MeaSureUnitType extends EnumType<MeaSureUnitType>() {

    static readonly MUT_WEIGHT  = new MeaSureUnitType(1, "Вес");
    static readonly MUT_VOLUME  = new MeaSureUnitType(2, "Объем");
    static readonly MUT_PIECES  = new MeaSureUnitType(3, "Штуки");
    static readonly MUT_MONEY   = new MeaSureUnitType(4, "Деньги");

    private constructor(public code: number, public text: string) {
        super();
    }
}
