import {Enum, EnumType} from "./interfaces/ts-jenum";

@Enum("text")
export class UnitDisableState extends EnumType<UnitDisableState>() {

    static readonly SET_NOTDISABLE = new UnitDisableState(1, "Активный");
    static readonly SET_DISABLE = new UnitDisableState(2, "Заблокирован");

    private constructor(public code: number, public text: string) {
        super();
    }
}
