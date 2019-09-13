import {Enum, EnumType} from "./interfaces/ts-jenum";

@Enum("text")
export class TaxSystemType extends EnumType<TaxSystemType>() {

    static readonly TS_OSN                           = new TaxSystemType(1, "ОСН");
    static readonly TS_ENVD                          = new TaxSystemType(2, "ЕНВД");
    static readonly TS_SIMPLE                        = new TaxSystemType(3, "УСНД");
    static readonly TS_SIMPLE_REVENUE_MINUS_EXPENSES = new TaxSystemType(4, "УСНДР");
    static readonly TS_AGRICULTURAL                  = new TaxSystemType(5, "ЕСН");
    static readonly TS_PATENT                        = new TaxSystemType(6, "Патент");

    private constructor(public code: number, public text: string) {
        super();
    }
}
