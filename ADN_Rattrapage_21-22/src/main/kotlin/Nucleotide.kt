enum class Nucleotide(val value: String):Complement {
    Adenine("A"){
        override fun complement(): Nucleotide {
            return Nucleotide.Thymine

        };
    },
    Cytosine("C"){
        override fun complement(): Nucleotide {
            return Nucleotide.Guanine
        };
    },
    Guanine("G"){
        override fun complement(): Nucleotide {
            return Nucleotide.Cytosine
        };
    },
    Thymine("T"){

        override fun complement(): Nucleotide {
            return Nucleotide.Adenine
        };

    };
    override fun toString(): String {
        return this.value
    }


}