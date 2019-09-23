
export class ConvertHelper {

    public static mapToString(data: Map<any, any>): any {
        return JSON.stringify(
            Array.from(data.entries())
                 .reduce((o, [key, value]) => {
                     o[key] = value;
                     return o;
            }, {}));
    }

    public static mapToObject(data: Map<any, any>): any {
        return Array.from(data.entries())
                 .reduce((o, [key, value]) => {
                     o[key] = value;
                     return o;
            }, {});
    }

    public static mergeMap(map1: Map<any, any>, map2: Map<any, any>): any {
        return new Map(Array.from(map1).concat(Array.from(map2)));
    }
}
