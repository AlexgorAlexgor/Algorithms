package algorithmLesson071123;


class Sort {
        public static void main(String[] args) {
            int[] array = {3,4,5,6,7,8,1,2};
            System.out.println(index(array));

        }

        public static int index(int[] arr) {
            for (int i=0;i<arr.length-1;i++){
                if (arr[i]>arr[i+1]) return i+1;
            }
            return -1;
        }

    }


